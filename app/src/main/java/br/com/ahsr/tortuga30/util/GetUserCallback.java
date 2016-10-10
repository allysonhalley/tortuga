package br.com.ahsr.tortuga30.util;

import br.com.ahsr.tortuga2.model.User;

interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}
