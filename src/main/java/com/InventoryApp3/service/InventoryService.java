package com.InventoryApp3.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.InventoryApp3.domain.Inventory;
import com.InventoryApp3.dto.InventoryDTO;
import com.InventoryApp3.dto.InventorySearchDTO;
import com.InventoryApp3.dto.InventoryPageDTO;
import com.InventoryApp3.dto.InventoryConvertCriteriaDTO;
import com.InventoryApp3.service.GenericService;
import com.InventoryApp3.dto.common.RequestDTO;
import com.InventoryApp3.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface InventoryService extends GenericService<Inventory, Integer> {

	List<Inventory> findAll();

	ResultDTO addInventory(InventoryDTO inventoryDTO, RequestDTO requestDTO);

	ResultDTO updateInventory(InventoryDTO inventoryDTO, RequestDTO requestDTO);

    Page<Inventory> getAllInventorys(Pageable pageable);

    Page<Inventory> getAllInventorys(Specification<Inventory> spec, Pageable pageable);

	ResponseEntity<InventoryPageDTO> getInventorys(InventorySearchDTO inventorySearchDTO);
	
	List<InventoryDTO> convertInventorysToInventoryDTOs(List<Inventory> inventorys, InventoryConvertCriteriaDTO convertCriteria);

	InventoryDTO getInventoryDTOById(Integer inventoryId);



	
}
