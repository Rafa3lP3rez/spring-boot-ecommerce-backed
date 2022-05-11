package com.ecommerce.dao;

import com.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


// Para modificar la ruta                   la ruta seria /product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
// productRepository sera el nombre de la entrada del json real
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {


}
