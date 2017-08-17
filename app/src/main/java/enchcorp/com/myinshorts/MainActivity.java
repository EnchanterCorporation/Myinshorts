package enchcorp.com.myinshorts;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.luseen.verticalintrolibrary.VerticalIntro;
import com.luseen.verticalintrolibrary.VerticalIntroItem;

public class MainActivity extends VerticalIntro {

    @Override
    protected void init() {

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.methali)
                .title("Kohli congratulates Mithali, posts photo of another player")
                .text("Indian captain Virat Kohli congratulated women's team skipper Mithali Raj for becoming the highest run-getter in women's ODIs."+
                        "but posted the wrong picture on social media. Along with his congratulatory message on Facebook, Kohli posted a picture of women's team player Punam Raut."+
                        "which was pointed out by his followers. The post was later deleted."
                )
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.methali)
                .title("iPhone chipmaker's 86-year-old Founder becomes billionaire ")
                .text("Morris Chang, the 86-year-old Founder and Chairman of Taiwanese chipmaking company TSMC that makes chips for Apple's iPhones, has become a billionaire according to Bloomberg. This comes after his company's shares soared on the optimism over the next iPhone's release. Chang owns 0.5% of the business directly and through his family.")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.methali)
                .title("Gujarat to get India's first high-speed rail training centre")
                .text("A training centre for high-speed trains will be built in Gujarat's Gandhinagar, and is expected to start operating by 2020, the MD of National High Speed Rail Corporation (NHSRC) has said. It will provide training for around 4,000 rail engineers, before the country's first bullet train becomes operational in 2023. It will be built at a cost of ₹600 crore")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.methali)
                .title("Snapdeal asks Flipkart at least $900 mn for buyout deal")
                .text("Snapdeal has asked bigger rival Flipkart to pay at least $900 million in stock after rejecting the latter's latest buyout offer, according to a Livemint report. Flipkart is yet to respond to Snapdeal’s demand but the company will send a new offer this week. Earlier this month, Snapdeal rejected Flipkart's $800-850 million buyout offer.")
                .build());
        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.methali)
                .title("Maharashtra announces free insurance scheme for legislators")
                .text("The Maharashtra government has launched a scheme to cover medical insurance of up to ₹10 lakh of 335 sitting legislators, 837 former legislators, and their families. This is reportedly aimed at curbing the use of fake bills in the medical reimbursement scheme the legislators were covered under earlier. The insurance scheme will cost the state almost ₹10 crore a year.")
                .build());

        setSkipEnabled(true);
        setVibrateEnabled(true);
//        setNextText("OK");
//        setDoneText("FINISH HIM");
//        setSkipText("GO GO");
        setVibrateIntensity(20);
//        setCustomTypeFace(Typeface.createFromAsset(getAssets(), "fonts/NotoSans-Regular.ttf"));
    }

    @Override
    protected Integer setLastItemBottomViewColor() {
        return R.color.color2;
    }

    @Override
    protected void onSkipPressed(View view) {
        Log.e("onSkipPressed ", "onSkipPressed");
    }

    @Override
    protected void onFragmentChanged(int position) {
        Log.e("onFragmentChanged ", "" + position);
    }

    @Override
    protected void onDonePressed() {

        Toast.makeText(this, "u have to pay 10 Rs for next pages", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}



