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
        DataService.Init();

        DetailFacade detailFacade = new DetailFacade();
        DetailRequest detailRequest = new DetailRequest(null,UUID.fromString("20000000-0000-0000-0000-0000000000000"),"FIRST_NAME");
        DetailBasic detail = detailFacade.getDetail(detailRequest);
        if (detail!=null)
            detail.show();
        else
            System.out.println("Detail not set");

        DetailRequest detailRequest2 = new DetailRequest(UUID.fromString("00000000-0000-0000-0000-0000000000077"),null,"KYCID");
        detail = detailFacade.getDetail(detailRequest2);
        if (detail!=null)
            detail.show();
        else
            System.out.println("Detail not set");

        EntityCreatorBasic creatorBasic= new EntityCreatorAtr();
        ProfileBuilder builderProfile = new ProfileBuilder(UUID.fromString("00000000-0000-0000-0000-0000000000077"));
        creatorBasic.Construct(builderProfile);
        Entity entity = builderProfile.build();
        entity.show();

    }
}
