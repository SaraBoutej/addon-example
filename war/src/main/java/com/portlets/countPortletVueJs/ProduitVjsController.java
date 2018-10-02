package com.portlets.countPortletVueJs;

import juzu.Path;
import juzu.template.Template;
import org.exoplatform.samples.dao.ProduitDao;

import javax.inject.Inject;

public class ProduitVjsController {

    @Inject
    @Path("index.gtmpl")
    Template index_template;

    @Inject
    ProduitDao prodDao;
}
