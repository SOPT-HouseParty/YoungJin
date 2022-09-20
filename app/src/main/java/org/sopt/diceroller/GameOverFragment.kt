package org.sopt.diceroller

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import org.sopt.diceroller.base.BaseFragment
import org.sopt.diceroller.databinding.FragmentGameOverBinding

class GameOverFragment : BaseFragment<FragmentGameOverBinding>(R.layout.fragment_game_over) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initLayout()
    }

    private fun initLayout() {
        binding.tryAgainButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
    }
}