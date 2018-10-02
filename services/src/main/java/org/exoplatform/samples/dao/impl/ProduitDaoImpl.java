package org.exoplatform.samples.dao.impl;

import org.exoplatform.commons.persistence.impl.GenericDAOJPAImpl;
import org.exoplatform.samples.dao.ProduitDao;
import org.exoplatform.samples.entity.Produit;

import java.util.List;

public class ProduitDaoImpl extends GenericDAOJPAImpl<Produit , Long > implements ProduitDao {

    @Override
    public Long count() {
        return super.count();
    }

    @Override
    public Produit find(Long id) {
        return super.find(id);
    }

    @Override
    public List<Produit> findAll() {
        return super.findAll();
    }

    @Override
    public Produit create(Produit prod) {
        return super.create(prod);
    }

    @Override
    public void createAll(List<Produit> prods) {
         super.createAll(prods);
    }

    @Override
    public Produit update(Produit prod) {
        return super.update(prod);
    }

    @Override
    public void updateAll(List<Produit> prods) {
          super.updateAll(prods);
    }

    @Override
    public void delete(Produit prod) {
         super.delete(prod);
    }

    @Override
    public void deleteAll(List<Produit> prods) {
         super.deleteAll(prods);
    }

    @Override
    public void deleteAll() {
         super.deleteAll();
    }
}
