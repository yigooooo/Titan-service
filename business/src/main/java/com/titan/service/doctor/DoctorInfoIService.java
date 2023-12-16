package com.titan.service.doctor;

import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.utils.Result;

/**
 * 醫生信息接口
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface DoctorInfoIService extends IService<DoctorInfoEntity> {

    void add(DoctorInfoEntity doctorInfoEntity);

}