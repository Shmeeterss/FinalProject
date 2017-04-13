package com.example.ishmeet.finalproject.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.widget.RadioGroup;

import com.example.ishmeet.finalproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ishmeet on 4/11/2017.
 */

public class CustomDialog extends Dialog {

    private int checkedID;

    @BindView(R.id.rdg)
    RadioGroup rdGroup;

    @OnClick(R.id.dialog_ok)
    public void okClick(){
        switch (checkedID){
            case R.id.rb1:
                listener.onClickListener();
                break;
            case R.id.rb2:
                break;
        }
        dismiss();
    }

    private ICustomDialogEventListener listener;


    //INTERFACE
    public interface ICustomDialogEventListener{
        public void onClickListener();
    }

    public CustomDialog(@NonNull Context context,ICustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;
    }

    //    rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
//
////            checkedID = (checkedId%10);
//        }
//    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        ButterKnife.bind(this);


        rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }
}
