package com.jj.howselect2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();
        ArrayList<String> list = new ArrayList<>();
        for (int x=0;x<99;x++){
            list.add("name"+x);
        }
        final RecyclerView rv_main = (RecyclerView) findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv_main.setLayoutManager(layoutManager);
        rv_main.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.HORIZONTAL));//添加默认分割线
        final MyRvAdapter myRvAdapter = new MyRvAdapter(list, context);
        rv_main.setAdapter(myRvAdapter);
        myRvAdapter.setOnItemClickLitener(new MyRvAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                TextView tv_item = (TextView) view.findViewById(R.id.tv_item);
                String s = tv_item.getText().toString();
                Toast.makeText(getApplicationContext(),"点击"+position+s,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
//                rv_main.removeView(view);
                myRvAdapter.notifyItemRemoved(position);

                myRvAdapter.notifyItemInserted(position);
            }
        });

    }

}
