package com.pavandeep.leave_management.controller;

import com.pavandeep.leave_management.model.LeaveRequest;
import com.pavandeep.leave_management.service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService service;

    @PostMapping("/apply")
    public LeaveRequest applyLeave(@Valid @RequestBody LeaveRequest leaveRequest) {
        return service.saveLeaveRequest(leaveRequest);
    }

    @GetMapping("/all")
    public List<LeaveRequest> getAllLeaves() {
        return service.getAllLeaveRequests();
    }

    @DeleteMapping("/{id}")
    public String deleteLeave(@PathVariable Long id) {
        service.deleteLeaveRequest(id);
        return "Leave request deleted successfully";
    }

    @PutMapping("/update-status/{id}")
    public LeaveRequest updateLeaveStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        return service.updateLeaveStatus(id, status);
    }
}