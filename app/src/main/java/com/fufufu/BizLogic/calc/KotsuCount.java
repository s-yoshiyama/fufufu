package com.fufufu.BizLogic.calc;

/**
 * 刻子の値を保持するクラス。
 */
public class KotsuCount {

    public int minkoCount;

    public int ankoCount;

    public int minkanCount;

    public int ankanCount;

    public KotsuCount(
            int minkoCount,
            int ankoCount,
            int minkanCount,
            int ankanCount
    ) {
        this.minkoCount = minkoCount;
        this.ankoCount = ankoCount;
        this.minkanCount = minkanCount;
        this.ankanCount = ankanCount;
    }

}
