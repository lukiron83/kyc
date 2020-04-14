import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DetailFacade {
    Map<String, String> mapOfDetailTypes = new HashMap<String, String>() {{
        put("FIRST_NAME", "PARTY_DETAIL");
        put("LAST_NAME", "PARTY_DETAIL");
        put("KYCID", "PROFILE_DETAIL");
    }};
    Map<String, ReaderService> mapOfServices = new HashMap<String, ReaderService>() {{
        put("PARTY_DETAIL", new ReaderServicePartyDetail());
        put("PROFILE_DETAIL", new ReaderServiceProfileDetail());
    }};

    DetailBasic getDetail(DetailRequest dRequest) {
        String detailType = mapOfDetailTypes.get(dRequest.getName());
        ReaderService readerService=mapOfServices.get(detailType);
        return readerService.getDetail(dRequest);
    }

    public ArrayList<DetailBasic> getAllPartyDetails(UUID id) {
        ReaderService readerService=new ReaderServicePartyDetail();
        return readerService.getAllDetails(id);
    }
    public ArrayList<DetailBasic> getAllProfileDetails(UUID id) {
        ReaderService readerService=new ReaderServiceProfileDetail();
        return readerService.getAllDetails(id);
    }

}
