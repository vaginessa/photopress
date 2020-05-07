package net.c306.photopress.ui.custom

import androidx.navigation.fragment.findNavController

abstract class AppBarNoBottomNavFragment: NoBottomNavFragment(), AppBarFragmentInterface {
    
    abstract override val myNavId: Int
    
    /**
     * Close fragment
     */
    override fun dismiss() {
        findNavController().popBackStack(myNavId, true)
    }

}