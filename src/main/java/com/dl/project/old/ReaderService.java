package com.dl.project.old;

import java.util.ArrayList;
import java.util.UUID;

public interface ReaderService {
    public DetailBasic getDetail(DetailRequest dRequest);
    public ArrayList<DetailBasic> getAllDetails(UUID parentId);
}
