package com.test.genericservicewisetable.repository;

import com.test.genericservicewisetable.entity.PointToPoint;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PointToPointRepo extends AbstractPaymentRepo<PointToPoint,Long>{
    List<PointToPoint>   findAllBySenderStatus(String status);
}
