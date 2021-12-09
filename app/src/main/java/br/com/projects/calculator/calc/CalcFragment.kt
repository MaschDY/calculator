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
        setupViews()
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel
    }

    private fun setupViews() = with(binding) {
        viewModel.calcNum.observe(viewLifecycleOwner) {
            txtCalc.text = it
        }
    }

    private fun setupButtons() = with(binding) {
        btnC.setOnClickListener {
            viewModel.cleanup(btnC.text.toString())
        }

        btnAC.setOnClickListener {
            viewModel.cleanup(btnAC.text.toString())
        }

        btnPlus.setOnClickListener {
//            TODO(): viewModel.( btnPlus.text.toString())
        }

        btnSeven.setOnClickListener {
            viewModel.setCalcNumber(btnSeven.text.toString())
        }

        btnEight.setOnClickListener {
            viewModel.setCalcNumber(btnEight.text.toString())
        }

        btnNine.setOnClickListener {
            viewModel.setCalcNumber(btnNine.text.toString())
        }

        btnFour.setOnClickListener {
            viewModel.setCalcNumber(btnFour.text.toString())
        }

        btnFive.setOnClickListener {
            viewModel.setCalcNumber(btnFive.text.toString())
        }

        btnSix.setOnClickListener {
            viewModel.setCalcNumber(btnSix.text.toString())
        }

        btnOne.setOnClickListener {
            viewModel.setCalcNumber(btnOne.text.toString())
        }

        btnTwo.setOnClickListener {
            viewModel.setCalcNumber(btnTwo.text.toString())
        }

        btnThree.setOnClickListener {
            viewModel.setCalcNumber(btnThree.text.toString())
        }

        btnZero.setOnClickListener {
            viewModel.setCalcNumber(btnZero.text.toString())
        }
    }
}