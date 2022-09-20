package org.sopt.diceroller

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import org.sopt.diceroller.base.BaseFragment
import org.sopt.diceroller.databinding.FragmentGameWonBinding

class GameWonFragment : BaseFragment<FragmentGameWonBinding>(R.layout.fragment_game_won) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initLayout()
    }

    private fun initLayout() {
        binding.congratulationsButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
        }
    }
}