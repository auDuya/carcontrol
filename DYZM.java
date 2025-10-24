DYZM
后备箱
易控
临时
测试
语音键
透明度

Ln8/i;
空调悬浮面板

Lh8/b;
const-string p0, "com.netease.uuremote"
invoke-static {p0}, Lf9/a;->n(Ljava/lang/String;)V
智能桌面

Ln8.m2;
invoke-static {}, Lf9/a;->p()V  
设置键长按  - 原桌面

const-string v0, "KEY_PIP_SINGLE_MODE_DEFAULT_APP"
KEY_DEFAULT_MUSIC_APP
画中画自启 默认音乐app

o8/d
KEY_PIP_SINGLE_MODE_FORCE_APP_STATE
    const-string v3, "com.byd.automap/com.byd.automap.activity.StartupActivity"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

排除地图强制启动


const/high16 p1, -0x10000
环形进度条

com.byd.carsettings
invoke-static {}, Lf9/a;->h()V
车辆设置长按 - 无障碍

const v0, 0x7f0f00bd
清除授权成功提示

getTotalMileageValue
提示总里程 208行

com.byd.byddevelopmenttools
com.byd.systemsettings.accessibility.AccessibilityMainActivity
无障碍直接进入

"#FFFFFF  
0E1927
0F1C2C

    const-string v1, "KEY_SINGLE_PIP_DESKTOP_CARD_ALPHA_LEVEL"

    invoke-static {v1}, Lf9/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v1, p1

导航条颜色·透明度

v5, v2, v2, v
v5, v4, v2, v5
v4, v5, v5, v2    119行
车窗控制

0069FF
00ACED
按钮变色 


121
按键绑定

    invoke-static {}, Lq7/b;->a()Lq7/a;

    move-result-object p1

    const-string v0, "RX_BUS_DISMISS_CHANGED"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lq7/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lq7/b;->a()Lq7/a;

    move-result-object p1

    const-string v0, "RX_BUS_PIP_L_R_LAYOUT_MODE_CHANGED"

    invoke-virtual {p1, v0, v1}, Lq7/a;->h(Ljava/lang/String;Ljava/lang/Object;)V


121  模式
130  语音
131 旋转屏幕 长
132 旋转屏幕

0x7f0a00bb
        const-string v0, "KEY_FLOAT_BG_ALPHA_LEVEL"

    invoke-static {v0}, Lf9/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    iget-object v1, p0, La9/e;->b:Lg8/o2;

    iget-object v1, v1, Lg8/o2;->D:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, La9/e;->b:Lg8/o2;

    iget-object v1, v1, Lg8/o2;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, La9/e;->b:Lg8/o2;

    iget-object v1, v1, Lg8/o2;->B:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

画中画透明度 跟随悬浮面


0x7f0700ad 12  0x7f070097  10
0x7f0701c1  4    0x7f0701d1   5
0x7f0701cb 46  0x7f0701d2   50
0x7f0701dd  6   0x7f070097  10
0x7f0701d5  52  0x7f0701d2  50

e  0x7f0700b9 130  80  c 0x7f0701f7
g  0x7f0700da 160  50  e
h  0x7f070098 100   f    
j   0x7f0700ae  120       h
k  0x7f0700da  160 120   i
q  0x7f0700ae 120    n
r   0x7f0700c4  140  120   o
v  0x7f070202  90      q



iiii
c  526   0x7f0701b9
