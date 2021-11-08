// Generated by data binding compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myapplication.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentArticleBinding extends ViewDataBinding {
  @NonNull
  public final ImageFilterView ivArticleImage;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvPublishedAt;

  @NonNull
  public final TextView tvTitle;

  protected FragmentArticleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageFilterView ivArticleImage, TextView tvAuthor, TextView tvContent, TextView tvDescription,
      TextView tvPublishedAt, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivArticleImage = ivArticleImage;
    this.tvAuthor = tvAuthor;
    this.tvContent = tvContent;
    this.tvDescription = tvDescription;
    this.tvPublishedAt = tvPublishedAt;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleBinding>inflateInternal(inflater, R.layout.fragment_article, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleBinding>inflateInternal(inflater, R.layout.fragment_article, null, false, component);
  }

  public static FragmentArticleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentArticleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentArticleBinding)bind(component, view, R.layout.fragment_article);
  }
}