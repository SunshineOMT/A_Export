package com.crlandpm.module_export

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Author: Danny Yang
 * Date: 2022/02/24/3:17 下午
 */

interface AService : IProvider {
    fun getTips() : AInfo
}