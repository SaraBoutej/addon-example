@Application(defaultController = ProduitVjsController.class)
@Portlet(name="ProduitPortletVueJs")

/**
 @Scripts(
 {
 //@Script(value = "javascript/jquery-3.2.1.min.js", id = "jquery",location = AssetLocation.SERVER),
 //@Script(value = "javascript/vue.esm.browser.js", id = "vuejs",location = AssetLocation.SERVER, header = true),
 //@Script(value = "javascript/btj_custom.js", id = "categoriesjs",location = AssetLocation.SERVER,depends = "vuejs")

 }
 )
 */

@Stylesheets(
        {
                @Stylesheet(value = "/org/exoplatform/addons/portlets/github/assets/global.css", location = AssetLocation.APPLICATION, id = "global")
        }

)

@Bindings({@Binding(ProduitDao.class)})

@Less(value = {"global.less"}, minify = true)
@Assets("*")
package com.portlets.countPortletVueJs;


import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.*;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.less.Less;
import juzu.plugin.portlet.Portlet;
import org.exoplatform.samples.dao.ProduitDao;