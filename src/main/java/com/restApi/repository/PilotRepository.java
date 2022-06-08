package com.restApi.repository;

import com.restApi.PilotObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PilotRepository extends JpaRepository<PilotObject, Long> {


}
