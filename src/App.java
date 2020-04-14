import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

enum PROD_ENUM {
    KRZ,
    ST}

public class App {

    public static void main(String[] args) {
        testDetails();
    }

    private static void testDetails() {
        System.out.println("KYCTest");

        //Setting data - look to the class what is where (I used Arrays instead of H2. All data is on GUIDS no Ids
        DataService.Init();

        //Single party detail (for party identified by GUID) by Facade and sufficient Strategy for PartyDeatails reading and ProfileDetails
        DetailFacade detailFacade = new DetailFacade();
        DetailRequest detailRequest = new DetailRequest(null,UUID.fromString("20000000-0000-0000-0000-0000000000000"),"FIRST_NAME");
        DetailBasic detail = detailFacade.getDetail(detailRequest);
        if (detail!=null)
            detail.show();
        else
            System.out.println("Detail not set");

        //Single profile detail - party Id is null here
        DetailRequest detailRequest2 = new DetailRequest(UUID.fromString("00000000-0000-0000-0000-0000000000077"),null,"KYCID");
        detail = detailFacade.getDetail(detailRequest2);
        if (detail!=null)
            detail.show();
        else
            System.out.println("Detail not set");

        //Reading whole ProfileEntity - using ProfileBuilder
        //This Director (Creator) creates Entity only with it's attributes
        EntityCreatorBasic creatorBasic= new EntityCreatorAtr();
        ProfileBuilder builderProfile = new ProfileBuilder(UUID.fromString("00000000-0000-0000-0000-0000000000077"));
        creatorBasic.Construct(builderProfile);
        Entity entity = builderProfile.build();
        entity.show(); //This is shit - use Breakpoint/Watch unil I will do the DetailPrinter

        //Same Profile, same Builder differnt Director - read only Relations
        creatorBasic= new EntityCreatorRels();
        builderProfile = new ProfileBuilder(UUID.fromString("00000000-0000-0000-0000-0000000000077"));
        creatorBasic.Construct(builderProfile);
        entity = builderProfile.build();
        entity.show();

        //Same Profile - attributes and Relations
        creatorBasic= new EntityCreatorAtrRels();
        builderProfile = new ProfileBuilder(UUID.fromString("00000000-0000-0000-0000-0000000000077"));
        creatorBasic.Construct(builderProfile);
        entity = builderProfile.build();
        entity.show();

        //Single PArty read - attributes only
        creatorBasic= new EntityCreatorAtr();
        PartyBuilder builderParty = new PartyBuilder(UUID.fromString("20000000-0000-0000-0000-0000000000000"));
        creatorBasic.Construct(builderParty);
        entity = builderParty.build();
        entity.show();
        
        //Other Profile - all (attributes, relations, and attributes of parties in relations)
        //Inside of ProfileBuilder I used PartyBuilder
        creatorBasic= new EntityCreatorAtrRelsAtr();
        builderProfile = new ProfileBuilder(UUID.fromString("00000000-0000-0000-0000-0000000000099"));
        creatorBasic.Construct(builderProfile);
        entity = builderProfile.build();
        entity.show();
    }
}
