package com.fpt.services.refproductorder;/*
  By Chi Can Em  20-01-2018
 */

import com.fpt.entity.RefProductOrder;
import org.springframework.stereotype.Service;

@Service
public interface RefProductOrderServices {
    void saveRefProductOrder(RefProductOrder refProductOrder);
}
