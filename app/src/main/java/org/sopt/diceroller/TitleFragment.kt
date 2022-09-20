package org.sopt.diceroller

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import org.sopt.diceroller.base.BaseFragment
import org.sopt.diceroller.databinding.FragmentTitleBinding

class TitleFragment : BaseFragment<FragmentTitleBinding>(R.layout.fragment_title) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initLayout()
    }

    private fun initLayout() {
        binding.playButton.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
    }
}