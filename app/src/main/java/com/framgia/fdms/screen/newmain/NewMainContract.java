package com.framgia.fdms.screen.newmain;

import com.framgia.fdms.BasePresenter;
import com.framgia.fdms.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface NewMainContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
    }
}
