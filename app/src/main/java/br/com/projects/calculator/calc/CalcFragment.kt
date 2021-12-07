package br.com.projects.calculator.calc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.projects.calculator.databinding.CalcFragmentBinding

class CalcFragment : Fragment() {
    private lateinit var binding: CalcFragmentBinding
    private lateinit var viewModel: CalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CalcFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this)[CalcViewModel::class.java]
        setupButtons()
        return binding.root
    }

    private fun setupButtons() = with(binding) {
        btnC.setOnClickListener {
            viewModel.cleanup(txtCalc.text.toString(), btnC.text.toString())
        }

        btnAC.setOnClickListener {
            viewModel.cleanup(txtCalc.text.toString(), btnAC.text.toString())
        }

        btnPlus.setOnClickListener {
//            TODO(): viewModel.(txtCalc.text.toString(), btnPlus.text.toString())
        }

        btnSeven.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnSeven.text.toString())
        }

        btnEight.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnEight.text.toString())
        }

        btnNine.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnNine.text.toString())
        }

        btnFour.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnFour.text.toString())
        }

        btnFive.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnFive.text.toString())
        }

        btnSix.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnSix.text.toString())
        }

        btnOne.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnOne.text.toString())
        }

        btnTwo.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnTwo.text.toString())
        }

        btnThree.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnThree.text.toString())
        }

        btnZero.setOnClickListener {
            viewModel.setCalcNumber(txtCalc.text.toString(), btnZero.text.toString())
        }
    }
}