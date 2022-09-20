package org.sopt.diceroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.sopt.diceroller.base.BaseFragment
import org.sopt.diceroller.databinding.FragmentGameBinding
import org.sopt.diceroller.databinding.FragmentTitleBinding

class GameFragment : BaseFragment<FragmentGameBinding>(R.layout.fragment_game) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initLayout()
    }

    private fun initLayout() {
        binding.gameWonButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
        }
        binding.gameOverButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
    }
}