package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLayoutBindingImpl extends ItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivImageArticle, 3);
        sViewsWithIds.put(R.id.tvDateSymbol, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.cvArticle.setTag(null);
        this.tvDate.setTag(null);
        this.tvShortDescription.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.example.myapplication.remote.response.Article) variable);
        }
        else if (BR.responseModel == variableId) {
            setResponseModel((com.example.myapplication.remote.response.ResponseDTO) variable);
        }
        else if (BR.source == variableId) {
            setSource((com.example.myapplication.remote.response.Source) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.example.myapplication.remote.response.Article Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }
    public void setResponseModel(@Nullable com.example.myapplication.remote.response.ResponseDTO ResponseModel) {
        this.mResponseModel = ResponseModel;
    }
    public void setSource(@Nullable com.example.myapplication.remote.response.Source Source) {
        this.mSource = Source;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.myapplication.remote.response.Article article = mArticle;
        java.lang.String articlePublishedAt = null;
        java.lang.String articleDescription = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (article != null) {
                    // read article.publishedAt
                    articlePublishedAt = article.getPublishedAt();
                    // read article.description
                    articleDescription = article.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, articlePublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvShortDescription, articleDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): responseModel
        flag 2 (0x3L): source
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}