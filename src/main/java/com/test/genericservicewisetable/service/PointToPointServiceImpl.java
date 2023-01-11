package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.PointToPoint;
import com.test.genericservicewisetable.repository.PointToPointRepo;
import org.springframework.stereotype.Service;

@Service
public class PointToPointServiceImpl extends AbstractPaymentServiceImpl<PointToPoint,Long> implements PointToPointService{

    private PointToPointRepo pointToPointRepo;

    public PointToPointServiceImpl(PointToPointRepo pointToPointRepo) {
        super(pointToPointRepo);
        this.pointToPointRepo = pointToPointRepo;
    }
}
