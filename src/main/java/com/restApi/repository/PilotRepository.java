package com.restApi.repository;

import com.restApi.PilotObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface PilotRepository extends CrudRepository<PilotObject, Long> {




}
