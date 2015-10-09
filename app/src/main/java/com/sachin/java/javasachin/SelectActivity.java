package com.sachin.java.javasachin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ahntaehyen on 15. 9. 5..
 */
public class SelectActivity extends Activity{
    private ImageButton maleButton;
    private ImageButton femaleButton;
    public static ArrayList<User> selected;
    public static ArrayList<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_activity);
        maleButton = (ImageButton)findViewById(R.id.male_button);
        femaleButton = (ImageButton)findViewById(R.id.female_button);
        userList = new ArrayList<User>();
        selected = new ArrayList<User>();
        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //남사친 버튼을 눌렀을 때


                    ArrayList<User> maleList = new ArrayList<User>();
                    maleList.add(new User(6, "이정훈", "둠치탁둠둠", true, "기타치고 노래하는 걸 좋아합니다. 인문학에 관심이 많고 이야기 나누는 걸 좋아합니다. 프로그래밍을 공부하고 있습니다.",1));
                    maleList.add(new User(4, "이희찬", "알파카", true, "안녕하세요 운동,음악,그림 좋아해요 잘 부탁드립니다.",1));
                    maleList.add(new User(9, "김동현", "태엽인형", true, "제가 좋아하는 것들은 피츠제럴드, 다자이오사무, 톨스토이, EDM, Inde music, 커피, 크래프트비어, 초콜렛 등 입니다. 같이 즐겨요",1));
                    maleList.add(new User(11, "송재승", "Ja.S", true, "춤을 사랑하고 음악악기 다루는걸 좋아하는 긍정주의 송재승이에요~~ 항상 즐거움을 추구하고있어요!!(모두의 즐거움)",1));
                    maleList.add(new User(13, "조성미", "금요일", true, "저는 야구, 농구 관람을 사랑하고, 날씨좋은날 걷기, 맛집 탐방, 좋은 콘서트나 뮤지컬도 좋아하는 활동형 사람입니다^^ 팀 상관없이 야구와 농구를 함께 직관하실 친구, 산책과 맛집 탐방을 함께하실 친구 찾고싶어요 :)",1));
                    maleList.add(new User(14, "김은휼", "피노키오", true, "늘 존재하지 않는 것을 이야기하고, 결국 현실로 이뤄내 스스로 코를 줄이는 자. 사람이 된 선한 피노키오.",1));
                    maleList.add(new User(15, "서호건", "Hogeony", true, "지속가능한 찰나적 행복주의자로서 \"Carpe diem\"을 삶의 모토로 품고 사는 새로운 걸 보고 듣고 느끼는 걸 좋아하는 남자입니다.",1));
                    //.... 이렇게 남성유저를 모두 추가합니다.

                    userList.clear();
                    Random rnum = new Random();
                    for(int i=0;i<4;i++){   //일단 세명만 랜덤으로 뽑아 봅니다.
                        int rand = rnum.nextInt(maleList.size());
                        userList.add( maleList.get(rand));
                        maleList.remove(rand);

                    }


                Toast.makeText(getApplicationContext(), "남사친!"+
                        userList.size()+"/"+
                        userList.get(0).getName()+"/"+
                        userList.get(1).getName()+"/"+
                        userList.get(2).getName()+"/"+
                        userList.get(3).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), FightActivity.class);
                startActivity(intent);
                // 한번 출력해 봅시다
            }
        });

        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //여사친 버튼을 눌렀을 때 (남사친의 경우와 같게 작동합니다.)
                ArrayList<User> femaleList = new ArrayList<User>();
                femaleList.add(new User(5, "나하나", "봄봄", false, "자유로운 영혼이고픈, 예술가를 꿈꾸는 소심한 삼십대 여자사람입니다. 책,생각,경험,사회적 가치,치킨을 좋아합니다",1));
                femaleList.add(new User(7, "강혜원", "마음의중심", false, "현실은 도심속 사무실안이지만 햇살비치는 조용한 전원생활을 늘 꿈꾸죠:) 취미는 공부이지만(공부계획을 좋아하는듯ㅋ) 생각만큼 잘되지않는 샐러던트입니당!",1));
                femaleList.add(new User(10, "신성희", "최고성자", false, "흥이 많아요. 가끔...두성랩을 흥얼거립니다.",1));
                femaleList.add(new User(12, "릴리", "Lily", false, "여행 좋아하고 하는것도 갔다온 사람의 이야기를 듣는것도 좋아합니다. 사진이나 글로 기록하는거 좋아하는 사람이구요 미술전시회 자주가는 편이고 생각을 나누는 것을 좋아합니다. " +
                        "책읽으며 좋아하는 구절을 캘리그라피로" +
                        " 쓰는 연습 중에 있습니다. 요즘 취미로 할수있는 운동을 찾는 중이며, 컴퓨터 나 게임분야엔 잘 알지 못합니다. 예의 있는 사람이 좋으며, 천천히 사람을 알아가는것을 좋아합니다. 뮤직컬, 공연 영화 글쓰기",1));
                femaleList.add(new User(19, "스마일송", "스마일송", false, "자전거산책,제프버넷,사람관찰,피아노,좋은목소리,예쁜말, 센스, 영화,선선한바람을 좋아하는 잘웃고 감정에 매우 솔직한 사람",1));
                femaleList.add(new User(22, "정현희", "하히호히호", false, "와인을 좋아해요! 전시회 가는 것도 좋아하고 맛있는 거 먹는 것도 좋아하고 함께 즐기는 분위기, 사람도 좋아하고~ 행복은 멀리 있는 게 아니라 생각하며 늘 밝고 긍정적으로 살아가려고 합니다:)",1));
                femaleList.add(new User(23, "김주영", "엠미", false, "게임 연극 소주 음악 춤 흥",1));
                femaleList.add(new User(43, "이현미", "로라라", false, "미를 추구하는 정적인 활동들을 좋아합니다. 건강함을 위한 운동을 좋아하고 마음이 동요하는 음악을 좋아합니다. 부지런하게 하고싶은 것들을 하려고 노력하며 삽니다.",1));
                //...이렇게 여성유저를 모두 추가합니다.



                userList.clear();
                Random rnum = new Random();
                for(int i=0;i<4;i++){   //일단 세명만 랜덤으로 뽑아 봅니다.
                    int rand = rnum.nextInt(femaleList.size());
                    userList.add(femaleList.get(rand));
                    femaleList.remove(rand);

                }

                Toast.makeText(getApplicationContext(), "여사친!"+userList.size()+"/"+
                        userList.get(0).getName()+"/"+
                        userList.get(1).getName()+"/"+
                        userList.get(2).getName()+"/"+
                        userList.get(3).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), FightActivity.class);
                startActivity(intent);
            }
        });

    }
}
