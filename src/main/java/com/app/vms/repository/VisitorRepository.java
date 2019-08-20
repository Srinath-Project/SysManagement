package com.app.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.vms.model.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, String> {

}
