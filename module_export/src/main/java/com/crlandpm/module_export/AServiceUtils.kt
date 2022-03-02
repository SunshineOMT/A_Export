package com.crlandpm.module_export

import com.alibaba.android.arouter.launcher.ARouter

/**
 * Author: Danny Yang
 * Date: 2022/02/24/3:18 下午
 */

object AServiceUtils {

    fun navigateToA(params1: String) {
        ARouter.getInstance().build(ARouterTable.PATH_A).withString("k1", params1).navigation()
    }

    fun getServiceA(): AService {
        return ARouter.getInstance().build(ARouterTable.PATH_SERVICE_A).navigation() as AService
    }

    fun getTips(): AInfo {
        return getServiceA().getTips()
    }
}