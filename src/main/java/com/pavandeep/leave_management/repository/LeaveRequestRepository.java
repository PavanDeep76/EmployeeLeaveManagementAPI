package com.pavandeep.leave_management.repository;

import com.pavandeep.leave_management.model.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {

}