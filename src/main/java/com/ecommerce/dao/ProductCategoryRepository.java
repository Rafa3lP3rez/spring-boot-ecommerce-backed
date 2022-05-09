package com.ecommerce.dao;

import com.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


// Para modificar la ruta                   la ruta seria /product-category
@RepositoryRestResource(collectionResourceRel = "productRepository", path = "product-category")
// productRepository sera el nombre de la entrada del json real
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {


}
