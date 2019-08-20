package com.app.vms.service;

import java.util.List;

import com.app.vms.model.Visitor;

public interface VisitorService {

	public List<Visitor> getAllVisitors();
	public void saveVisitor(Visitor visitor);
}
