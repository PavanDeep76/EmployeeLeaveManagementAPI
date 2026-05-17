package com.pavandeep.leave_management.service;

import com.pavandeep.leave_management.model.LeaveRequest;
import com.pavandeep.leave_management.repository.LeaveRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestService {

    @Autowired
    private LeaveRequestRepository repository;

    // Create leave request
    public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
        return repository.save(leaveRequest);
    }

    // Get all leave requests
    public List<LeaveRequest> getAllLeaveRequests() {
        return repository.findAll();
    }

    // Delete leave request
    public void deleteLeaveRequest(Long id) {
        repository.deleteById(id);
    }

    // Update leave status
    public LeaveRequest updateLeaveStatus(Long id, String status) {

        LeaveRequest leaveRequest = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave request not found"));

        leaveRequest.setStatus(status);

        return repository.save(leaveRequest);
    }
}