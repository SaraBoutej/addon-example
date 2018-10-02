package com.portlets.countPortlet;

import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;
import org.exoplatform.samples.dao.ProduitDao;

import javax.inject.Inject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProduitController {

    public static final String PRODUCT_NUMBER = "NbrProducts";
    @Inject
    @Path("index.gtmpl")
    Template index;

    @Inject
    ProduitDao prodDao;

    public long NbrProducts;

    @View
    public Response.Content index() throws IOException {
        NbrProducts=prodDao.count();
        Map<String,Object> params =new HashMap<String, Object>() ;
        params.put(PRODUCT_NUMBER , NbrProducts);
        return index.with(params).ok();
    }

}
