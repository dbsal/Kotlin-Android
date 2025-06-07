package com.example.app_project // 실제 패키지 이름으로 변경

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NotificationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // fragment_notification.xml 레이아웃을 inflate 합니다.
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }
}