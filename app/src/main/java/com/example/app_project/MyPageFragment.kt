package com.example.app_project // 실제 패키지 이름으로 변경

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast // Import Toast

// Import the generated binding class. The name depends on the layout file name: FragmentMyPageBinding
import com.example.app_project.databinding.FragmentMyPageBinding // Replace with your actual package and binding class name

class MyPageFragment : Fragment() {

    private var _binding: FragmentMyPageBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // View Binding을 사용하여 레이아웃을 inflate 합니다.
        _binding = FragmentMyPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 뒤로 가기 버튼 클릭 리스너
        binding.backButton.setOnClickListener {
            // 이전 화면으로 돌아가는 로직 구현 (예: 액티비티 종료 또는 이전 프래그먼트로 이동)
            activity?.onBackPressedDispatcher?.onBackPressed()
        }

        // 알림 스위치 상태 변경 리스너
        binding.notificationsSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(context, "알림 켜짐", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "알림 꺼짐", Toast.LENGTH_SHORT).show()
            }
        }

        // 설정 항목 클릭 리스너 (예시)
        binding.themeSetting.setOnClickListener { Toast.makeText(context, "테마 설정 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.languageSetting.setOnClickListener { Toast.makeText(context, "언어 설정 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.unitsSetting.setOnClickListener { Toast.makeText(context, "단위 설정 클릭됨", Toast.LENGTH_SHORT).show() }

        // About 항목 클릭 리스너 (예시)
        binding.rateApp.setOnClickListener { Toast.makeText(context, "앱 평가 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.shareApp.setOnClickListener { Toast.makeText(context, "앱 공유 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.helpFeedback.setOnClickListener { Toast.makeText(context, "도움말 및 피드백 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.termsService.setOnClickListener { Toast.makeText(context, "서비스 약관 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.privacyPolicy.setOnClickListener { Toast.makeText(context, "개인정보 처리방침 클릭됨", Toast.LENGTH_SHORT).show() }

        // 하단 탐색 아이템 클릭 리스너 (예시, 실제 프래그먼트 전환 로직은 MainActivity와 연동 필요)
        binding.navWeather.setOnClickListener { Toast.makeText(context, "날씨 탭 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.navLocation.setOnClickListener { Toast.makeText(context, "위치 탭 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.navList.setOnClickListener { Toast.makeText(context, "목록 탭 클릭됨", Toast.LENGTH_SHORT).show() }
        binding.navMyPage.setOnClickListener { Toast.makeText(context, "마이페이지 탭 클릭됨", Toast.LENGTH_SHORT).show() }

        // TODO: 프로필 이미지 로딩 로직 추가 (Glide, Coil 등 라이브러리 사용)
        // 예: Glide.with(this).load("YOUR_IMAGE_URL").into(binding.profileImage)

        // TODO: 사용자 이름, 상태 등 동적 데이터 설정 로직 추가
        // 예: binding.userName.text = "새로운 이름"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}