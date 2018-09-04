package com.example.admin.toastvalertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DangNhapThong extends AppCompatActivity {

    private EditText edttaikhoan;
    private EditText edtmatkhau;
    private CheckBox ckLuu;
    private Button btndangnhap;
    private Button btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_thong);

        edttaikhoan = (EditText) findViewById(R.id.nhapten);
        edtmatkhau = (EditText) findViewById(R.id.nhapmk);
        ckLuu = (CheckBox) findViewById(R.id.ckluu);
        btndangnhap = (Button) findViewById(R.id.dangnhap);
        btnthoat = (Button) findViewById(R.id.thoat);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( ckLuu.isChecked()){
                    Toast.makeText(DangNhapThong.this, "Chao mung ban dang nhap vao he thong thong tin cua ban da dc luu", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(DangNhapThong.this, "Khong duoc luu", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
    public void showAleftDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông báo");
        builder.setMessage("Bạn có muốn thoát không?");
        builder.setCancelable(false);
        builder.setPositiveButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Không thoát được", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(" xuất", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}

}
