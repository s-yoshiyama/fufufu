package com.fufufu.BizLogic.calc;

import com.fufufu.ChildScore;
import com.fufufu.ParentScore;

/**
 * 点数計算を行うビジネスロジッククラス。
 */
public class Calc {

    /**
     * 計算に必要な値を取得する。
     */
    public static CalcDTO calcData(CalcDTO calcDTO) {
        int han = calcDTO.han;
        int fu = 20;

        switch (calcDTO.horaType) {
            case TITOI:
                fu = 25;
                break;
            case PINFU:
                if (calcDTO.winType == WinType.PICK) {
                    fu = 20;
                    break;
                }
            case OTHERS:
                // 上がりの符
                if (calcDTO.winType == WinType.PICK) {
                    fu += 2;
                } else if (calcDTO.winType == WinType.WIN) {
                    fu += 10;
                }
                // メンツの符(2~8)
                fu += calcDTO.suhai.minkoCount * 2;
                fu += calcDTO.suhai.ankoCount * 4;
                fu += calcDTO.suhai.minkanCount * 8;
                fu += calcDTO.suhai.ankanCount * 16;
                // メンツの符(19字牌)
                fu += calcDTO.zihai.minkoCount * 4;
                fu += calcDTO.zihai.minkoCount * 8;
                fu += calcDTO.zihai.minkoCount * 16;
                fu += calcDTO.zihai.minkoCount * 32;
                // 頭の符
                if (calcDTO.jantoType == JantoType.ZIKAZE_BAKAZE) {
                    fu += 4;
                } else if (calcDTO.jantoType == JantoType.YAKUHAI) {
                    fu += 2;
                }
                // 待ちの符
                if (calcDTO.waitType == WaitType.ONE_TARGETS) {
                    fu += 2;
                }
                // 切り上げ
                fu = (int) Math.ceil(fu/10) * 10;
        }

        calcDTO.fu = fu;

        switch (calcDTO.playerAttribute) {
            case HOST:
               switch (calcDTO.winType) {
                   case PICK:
                       calcDTO.score = ParentScore.tsumoScore(han, fu);
                       break;
                   case WIN:
                       calcDTO.score = ParentScore.ronScore(han, fu);
                       break;
               }
                break;
            case PLAYERS:
                switch (calcDTO.winType) {
                    case PICK:
                        calcDTO.score = ChildScore.tsumoScore(han, fu);
                        break;
                    case WIN:
                        calcDTO.score = ChildScore.ronScore(han, fu);
                        break;
                }
        }
        return calcDTO;
    }

}
