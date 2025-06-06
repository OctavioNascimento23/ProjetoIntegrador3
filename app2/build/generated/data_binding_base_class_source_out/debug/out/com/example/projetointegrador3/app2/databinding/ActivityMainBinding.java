// Generated by view binder compiler. Do not edit!
package com.example.projetointegrador3.app2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projetointegrador3.app2.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnGenerateReport;

  @NonNull
  public final Button btnRiskList;

  @NonNull
  public final Button btnRiskMap;

  @NonNull
  public final MaterialCardView cardReports;

  @NonNull
  public final MaterialCardView cardRiskList;

  @NonNull
  public final MaterialCardView cardRiskMap;

  @NonNull
  public final TextView tvTitle;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull Button btnGenerateReport,
      @NonNull Button btnRiskList, @NonNull Button btnRiskMap,
      @NonNull MaterialCardView cardReports, @NonNull MaterialCardView cardRiskList,
      @NonNull MaterialCardView cardRiskMap, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnGenerateReport = btnGenerateReport;
    this.btnRiskList = btnRiskList;
    this.btnRiskMap = btnRiskMap;
    this.cardReports = cardReports;
    this.cardRiskList = cardRiskList;
    this.cardRiskMap = cardRiskMap;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGenerateReport;
      Button btnGenerateReport = ViewBindings.findChildViewById(rootView, id);
      if (btnGenerateReport == null) {
        break missingId;
      }

      id = R.id.btnRiskList;
      Button btnRiskList = ViewBindings.findChildViewById(rootView, id);
      if (btnRiskList == null) {
        break missingId;
      }

      id = R.id.btnRiskMap;
      Button btnRiskMap = ViewBindings.findChildViewById(rootView, id);
      if (btnRiskMap == null) {
        break missingId;
      }

      id = R.id.cardReports;
      MaterialCardView cardReports = ViewBindings.findChildViewById(rootView, id);
      if (cardReports == null) {
        break missingId;
      }

      id = R.id.cardRiskList;
      MaterialCardView cardRiskList = ViewBindings.findChildViewById(rootView, id);
      if (cardRiskList == null) {
        break missingId;
      }

      id = R.id.cardRiskMap;
      MaterialCardView cardRiskMap = ViewBindings.findChildViewById(rootView, id);
      if (cardRiskMap == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, btnGenerateReport, btnRiskList,
          btnRiskMap, cardReports, cardRiskList, cardRiskMap, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
