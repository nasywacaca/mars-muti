package com.example.mars_muti.Home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.mars_muti.AuthActivity
import com.example.mars_muti.Home.pertemuan4.FourthActivity
import com.example.mars_muti.Home.pertemuan5.FifthActivity
import com.example.mars_muti.Home.pertemuan6.SixthActivity
import com.example.mars_muti.databinding.FragmentHomeBinding
import com.example.mars_muti.pertemuan11.EleventhActivity
import com.example.mars_muti.pertemuan_10.TenthActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigasi Pertemuan 4
        binding.btnToFourth.setOnClickListener {
            val intent = Intent(requireContext(), FourthActivity::class.java)
            startActivity(intent)
        }

        // Navigasi Pertemuan 5
        binding.btnToFifth.setOnClickListener {
            val intent = Intent(requireContext(), FifthActivity::class.java)
            startActivity(intent)
        }

        // Navigasi Pertemuan 6
        binding.btnToSixth.setOnClickListener {
            val intent = Intent(requireContext(), SixthActivity::class.java)
            startActivity(intent)
        }

        // Navigasi Pertemuan 10
        binding.btnToTenth.setOnClickListener {
            val intent = Intent(requireContext(), TenthActivity::class.java)
            startActivity(intent)
        }

        // Navigasi Pertemuan 11
        binding.btnToEleventh.setOnClickListener {
            val intent = Intent(requireContext(), EleventhActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogout.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Konfirmasi Logout")
                .setMessage("Apakah Anda yakin ingin keluar?")
                .setPositiveButton("Ya") { dialog, _ ->
                    val sharedPref = requireContext().getSharedPreferences("user_pref", Context.MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.clear()
                    editor.apply()


                    dialog.dismiss()


                    val intent = Intent(requireContext(), AuthActivity::class.java)
                    startActivity(intent)
                    requireActivity().finish()
                }
                .setNegativeButton("Tidak", null)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}