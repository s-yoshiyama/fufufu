package com.fufufu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.fufufu.BizLogic.calc.Calc;
import com.fufufu.BizLogic.calc.CalcDTO;
import com.fufufu.BizLogic.calc.HoraType;
import com.fufufu.BizLogic.calc.JantoType;
import com.fufufu.BizLogic.calc.KotsuCount;
import com.fufufu.BizLogic.calc.PlayerAttribute;
import com.fufufu.BizLogic.calc.WaitType;
import com.fufufu.BizLogic.calc.WinType;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final int HAN_NUM_PICK_MIN = 1;

    public static final int HAN_NUM_PICK_MAX = 13;
    
    public static final int MENTSU_MIN = 0;

    public static final int MENTSU_MAX = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.setEvent();
        this.setClickListener();
    }

    private void setEvent() {
        this.setNumberPickerNumRange();
    }

    /**
     * クリックリスナーを設定する。
     */
    private void setClickListener() {
        Button calcButton = this.findViewById(R.id.calc);
        TextView textView = this.findViewById(R.id.result);
        calcButton.setOnClickListener(listen -> {
            try {
                CalcDTO calcDTO = this.getScreenParams();
                calcDTO = Calc.calcData(calcDTO);
                textView.setText(calcDTO.fu + "符" + calcDTO.han + "飜" + calcDTO.score);
            } catch (Exception e) {
                textView.setText("エラーが発生しました。");
            }
        });
    }

    /**
     * NumberPicker型の数値の下限上限を設定する。
     */
    private void setNumberPickerNumRange() {
        NumberPicker hanNumberPicker = this.findViewById(R.id.han_numpick);
        hanNumberPicker.setMinValue(HAN_NUM_PICK_MIN);
        hanNumberPicker.setMaxValue(HAN_NUM_PICK_MAX);
        NumberPicker suhaiMinkoNumberPicker = this.findViewById(R.id.suhai_mentsu_minko_numpick);
        suhaiMinkoNumberPicker.setMinValue(MENTSU_MIN);
        suhaiMinkoNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker suhaiAnkoNumberPicker = this.findViewById(R.id.suhai_mentsu_anko_numpick);
        suhaiAnkoNumberPicker.setMinValue(MENTSU_MIN);
        suhaiAnkoNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker suhaiMinkanNumberPicker = this.findViewById(R.id.suhai_mentsu_minkan_numpick);
        suhaiMinkanNumberPicker.setMinValue(MENTSU_MIN);
        suhaiMinkanNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker suhaiAnkanNumberPicker = this.findViewById(R.id.suhai_mentsu_ankan_numpick);
        suhaiAnkanNumberPicker.setMinValue(MENTSU_MIN);
        suhaiAnkanNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker zihaiMinkoNumberPicker = this.findViewById(R.id.zihai_mentsu_minko_numpick);
        zihaiMinkoNumberPicker.setMinValue(MENTSU_MIN);
        zihaiMinkoNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker zihaiAnkoNumberPicker = this.findViewById(R.id.zihai_mentsu_anko_numpick);
        zihaiAnkoNumberPicker.setMinValue(MENTSU_MIN);
        zihaiAnkoNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker zihaiMinkanNumberPicker = this.findViewById(R.id.zihai_mentsu_minkan_numpick);
        zihaiMinkanNumberPicker.setMinValue(MENTSU_MIN);
        zihaiMinkanNumberPicker.setMaxValue(MENTSU_MAX);
        NumberPicker zihaiAnkanNumberPicker = this.findViewById(R.id.zihai_mentsu_ankan_numpick);
        zihaiAnkanNumberPicker.setMinValue(MENTSU_MIN);
        zihaiAnkanNumberPicker.setMaxValue(MENTSU_MAX);
    }

    private CalcDTO getScreenParams() {
        NumberPicker hanNumberPicker = this.findViewById(R.id.han_numpick);

        NumberPicker suhaiMinkoNumberPicker = this.findViewById(R.id.suhai_mentsu_minko_numpick);
        NumberPicker suhaiAnkoNumberPicker = this.findViewById(R.id.suhai_mentsu_anko_numpick);
        NumberPicker suhaiMinkanNumberPicker = this.findViewById(R.id.suhai_mentsu_minkan_numpick);
        NumberPicker suhaiAnkanNumberPicker = this.findViewById(R.id.suhai_mentsu_ankan_numpick);
        KotsuCount suhai = new KotsuCount(
                suhaiMinkoNumberPicker.getValue(),
                suhaiAnkoNumberPicker.getValue(),
                suhaiMinkanNumberPicker.getValue(),
                suhaiAnkanNumberPicker.getValue()
        );

        NumberPicker zihaiMinkoNumberPicker = this.findViewById(R.id.zihai_mentsu_minko_numpick);
        NumberPicker zihaiAnkoNumberPicker = this.findViewById(R.id.zihai_mentsu_anko_numpick);
        NumberPicker zihaiMinkanNumberPicker = this.findViewById(R.id.zihai_mentsu_minkan_numpick);
        NumberPicker zihaiAnkanNumberPicker = this.findViewById(R.id.zihai_mentsu_ankan_numpick);
        KotsuCount zihai = new KotsuCount(
                zihaiMinkoNumberPicker.getValue(),
                zihaiAnkoNumberPicker.getValue(),
                zihaiMinkanNumberPicker.getValue(),
                zihaiAnkanNumberPicker.getValue()
        );

        RadioGroup parentChildRadioGroup = this.findViewById(R.id.parentChild);
        PlayerAttribute playerAttribute;
        if (parentChildRadioGroup.getCheckedRadioButtonId() == R.id.parentChild_parent) {
            playerAttribute = PlayerAttribute.HOST;
        } else {
            playerAttribute = PlayerAttribute.PLAYERS;
        }

        RadioGroup winRadioGroup = this.findViewById(R.id.win);
        WinType winType;
        if (winRadioGroup.getCheckedRadioButtonId() == R.id.win_pick) {
            winType = WinType.PICK;
        } else {
            winType = WinType.WIN;
        }

        RadioGroup waitRadioGroup = this.findViewById(R.id.wait);
        WaitType waitType;
        if (waitRadioGroup.getCheckedRadioButtonId() == R.id.wait_ryansyan) {
            waitType = WaitType.TWO_TARGETS;
        } else {
            waitType = WaitType.ONE_TARGETS;
        }

        RadioGroup jantoRadioGroup = this.findViewById(R.id.janto);
        JantoType jantoType;
        if (jantoRadioGroup.getCheckedRadioButtonId() == R.id.janto_zikazebakaze) {
            jantoType = JantoType.ZIKAZE_BAKAZE;
        } else if (jantoRadioGroup.getCheckedRadioButtonId() == R.id.janto_yakuhai) {
            jantoType = JantoType.YAKUHAI;
        } else {
            jantoType = JantoType.OTHERS;
        }

        RadioGroup yakuRadioGroup = this.findViewById(R.id.yaku);
        HoraType horaType;
        if (yakuRadioGroup.getCheckedRadioButtonId() == R.id.yaku_pinfu) {
            horaType = HoraType.PINFU;
        } else if (yakuRadioGroup.getCheckedRadioButtonId() == R.id.yaku_titoi) {
            horaType = HoraType.TITOI;
        } else {
            horaType = HoraType.OTHERS;
        }

        return new CalcDTO(
                playerAttribute,
                winType,
                hanNumberPicker.getValue(),
                horaType,
                waitType,
                jantoType,
                suhai,
                zihai
        );
    }

}
