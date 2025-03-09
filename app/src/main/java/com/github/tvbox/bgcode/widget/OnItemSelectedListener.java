package com.github.tvbox.bgcode.widget;

import android.view.View;

import com.owen.tvrecyclerview.widget.TvRecyclerView;

public interface OnItemSelectedListener extends TvRecyclerView.OnItemListener {
    @Override
    default void onItemClick(TvRecyclerView tvRecyclerView, View view, int i) {
    }

    @Override
    default void onItemPreSelected(TvRecyclerView tvRecyclerView, View view, int i) {
    }

    @Override
    void onItemSelected(TvRecyclerView tvRecyclerView, View view, int i);
}
