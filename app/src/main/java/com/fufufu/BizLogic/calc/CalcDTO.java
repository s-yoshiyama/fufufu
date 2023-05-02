package com.fufufu.BizLogic.calc;

/**
 * 点数計算に必要なデータをまとめたオブジェクト。
 */
public class CalcDTO {

    /** {@inheritDoc} */
    public PlayerAttribute playerAttribute;

    /** {@inheritDoc} */
    public WinType winType;

    /** 飜数。 */
    public int han;

    /** {@inheritDoc} */
    public HoraType horaType;

    /** {@inheritDoc} */
    public WaitType waitType;

    /** {@inheritDoc} */
    public JantoType jantoType;

    /** 2~8の牌。*/
    public KotsuCount suhai;

    /** 19字牌。 */
    public KotsuCount zihai;

    /** 符 */
    public int fu;

    /**  */
    public String score;

    /**
     * コンストラクタ。
     */
    public CalcDTO() {

    }

    /**
     * コンストラクタ。
     */
    public CalcDTO(
            PlayerAttribute playerAttribute,
            WinType winType,
            int han,
            HoraType horaType,
            WaitType waitType,
            JantoType jantoType,
            KotsuCount suhai,
            KotsuCount zihai
    ) {
        this.playerAttribute = playerAttribute;
        this.winType = winType;
        this.han = han;
        this.horaType = horaType;
        this.waitType = waitType;
        this.jantoType = jantoType;
        this.suhai = suhai;
        this.zihai = zihai;
    }

}
