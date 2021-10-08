

package com.spboot.projek1.services;


import com.spboot.projek1.interfaces.ProdukInterface;
import com.spboot.projek1.models.Produk;
import com.spboot.projek1.repositories.ProdukRepository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Deiga
 */
    @Service
    public class ProdukService implements ProdukInterface {

        @Autowired
        private ProdukRepository produkRepository;

        @Override
        public List<Produk> getAll() {
            return produkRepository.findAll();
        }

        @Override
        public void produk(Produk produk) {
            this.produkRepository.save(produk);
        }
    }
