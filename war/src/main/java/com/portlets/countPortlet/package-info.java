@juzu.plugin.servlet.Servlet(value = "/")

@Assets("*")
@Application
@Portlet(name="ProduitPortlet")
@Bindings({@Binding(ProduitDao.class)})

package com.portlets.countPortlet;

import juzu.Application;
import juzu.plugin.asset.Assets;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.portlet.Portlet;
import org.exoplatform.samples.dao.ProduitDao;
