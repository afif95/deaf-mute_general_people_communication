package com.example.afif.myfinalproject;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;


public class keyboard extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    private KeyboardView kv;
    private Keyboard keyboard;

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {
        ViewGroup originalParent = (ViewGroup) kv.getParent();
        if (originalParent != null) {
            originalParent.setPadding(0,150, 0, 0);
            kv.setPopupParent(originalParent);
        }
    }

    @Override
    public View onCreateInputView() {
        kv=(KeyboardView)getLayoutInflater().inflate(R.layout.keyboard,null);
        keyboard=new Keyboard(this,R.xml.qwerty);
        kv.setKeyboard(keyboard);
        kv.setOnKeyboardActionListener(this);
        return kv;
    }

    @Override
    public void onPress(int primaryCode) {
    }

    @Override
    public void onRelease(int primaryCode) {

    }
    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection ic=getCurrentInputConnection();
        switch(primaryCode){
            case 1:
                ic.commitText("ক",1);break;
            case 2:
                ic.commitText("খ",1);break;
            case 3:
                ic.commitText("গ",1);break;
            case 4:
                ic.commitText("ঘ",1);break;
            case 5:
                ic.commitText("ঙ",1);break;
            case 6:
                ic.commitText("চ",1);break;
            case 7:
                ic.commitText("ছ",1);break;
            case 8:
                ic.commitText("জ",1);break;
            case 9:
                ic.commitText("ঝ",1);break;
            case 10:
                ic.commitText("ঞ",1);break;
            case 11:
                ic.commitText("ট",1);break;
            case 12:
                ic.commitText("ঠ",1);break;
            case 13:
                ic.commitText("ড",1);break;
            case 14:
                ic.commitText("ঢ",1);break;
            case 15:
                ic.commitText("ণ",1);break;
            case 16:
                ic.commitText("ত",1);break;
            case 17:
                ic.commitText("থ",1);break;
            case 18:
                ic.commitText("দ",1);break;
            case 19:
                ic.commitText("ধ",1);break;
            case 20:
                ic.commitText("ন",1);break;
            case 21:
                ic.commitText("প",1);break;
            case 22:
                ic.commitText("ফ",1);break;
            case 23:
                ic.commitText("ব",1);break;
            case 24:
                ic.commitText("ভ",1);break;
            case 25:
                ic.commitText("ম",1);break;
            case 26:
                ic.commitText("য",1);break;
            case 27:
                ic.commitText("র",1);break;
            case 28:
                ic.commitText("ল",1);break;
            case 29:
                ic.commitText("শ",1);break;
            case 30:
                ic.commitText("ষ",1);break;
            case 31:
                ic.commitText("স",1);break;
            case 32:
                ic.commitText("হ",1);break;
            case 33:
                ic.commitText("ড়",1);break;
            case 34:
                ic.commitText("ঢ়",1);break;
            case 35:
                ic.commitText("য়",1);break;
            case 36:
                ic.commitText("ৎ",1);break;
            case 37:
                ic.commitText("ং",1);break;
            case 38:
                ic.commitText("ঃ",1);break;
            case 39:
                ic.commitText("ঁ",1);break;
            case Keyboard.KEYCODE_DELETE:
                ic.deleteSurroundingText(1,0);break;
            case 44:
                ic.commitText(String.valueOf((char)primaryCode),1);break;
            case 41:
                ic.commitText(" ",1);break;
            case 42:
                ic.commitText("।",1);break;
            case Keyboard.KEYCODE_DONE:
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));break;
            case 43:
                keyboard=new Keyboard(this,R.xml.qwerty2);
                kv.setKeyboard(keyboard);
                //kv.setPreviewEnabled(false);
                kv.setOnKeyboardActionListener(this);
                break;
            case 51:
                ic.commitText("১",1);break;
            case 52:
                ic.commitText("২",1);break;
            case 53:
                ic.commitText("৩",1);break;
            case 54:
                ic.commitText("৪",1);break;
            case 55:
                ic.commitText("৫",1);break;
            case 56:
                ic.commitText("৬",1);break;
            case 57:
                ic.commitText("৭",1);break;
            case 58:
                ic.commitText("৮",1);break;
            case 59:
                ic.commitText("৯",1);break;
            case 60:
                ic.commitText("০",1);break;
            case 61:
                ic.commitText("!",1);break;
            case 62:
                ic.commitText("#",1);break;
            case 63:
                ic.commitText("৳",1);break;
            case 64:
                ic.commitText("_",1);break;
            case 65:
                ic.commitText("=",1);break;
            case 66:
                ic.commitText("-",1);break;
            case 67:
                ic.commitText("+",1);break;
            case 68:
                ic.commitText("(",1);break;
            case 69:
                ic.commitText(")",1);break;
            case 70:
                ic.commitText("\\",1);break;
            case 71:
                ic.commitText("*",1);break;
            case 72:
                ic.commitText("x",1);break;
            case 73:
                ic.commitText(":",1);break;
            case 74:
                ic.commitText(";",1);break;
            case 75:
                ic.commitText("`",1);break;
            case 76:
                ic.commitText("?",1);break;
            case 77:
                ic.commitText("/",1);break;
            case 78:
                ic.commitText("{",1);break;
            case 79:
                ic.commitText("}",1);break;
            case 80:
                ic.commitText("~",1);break;
            case 81:
                ic.commitText(".",1);break;
            case 82:
                ic.commitText("[",1);break;
            case 83:
                ic.commitText("]",1);break;
            case 84:
                ic.commitText("%",1);break;
            case 85:
                ic.commitText("€",1);break;
            case 86:
                ic.commitText("^",1);break;
            case 87:
                ic.commitText("÷",1);break;
            case 88:
                ic.commitText("$",1);break;
            case 89:
                ic.commitText("@",1);break;
            case 90:
                keyboard=new Keyboard(this,R.xml.qwerty);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 91:
                ic.commitText("অ",1);break;
            case 92:
                ic.commitText("আ",1);break;
            case 93:
                ic.commitText("ই",1);break;
            case 94:
                ic.commitText("ঈ",1);break;
            case 95:
                ic.commitText("উ",1);break;
            case 96:
                ic.commitText("ঊ",1);break;
            case 97:
                ic.commitText("এ",1);break;
            case 98:
                ic.commitText("ঐ",1);break;
            case 99:
                ic.commitText("ও",1);break;
            case 100:
                ic.commitText("ঔ",1);break;
            case 101:
                ic.commitText("ঋ",1);break;
            case 102:
                ic.commitText("্য",1);break;
            case 103:
                keyboard=new Keyboard(this,R.xml.qwerty3);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 111:
                ic.commitText("া",1);break;
            case 112:
                ic.commitText("ি",1);break;
            case 113:
                ic.commitText("ী",1);break;
            case 114:
                ic.commitText("ু",1);break;
            case 115:
                ic.commitText("ূ",1);break;
            case 116:
                ic.commitText("ে",1);break;
            case 117:
                ic.commitText("ৈ",1);break;
            case 118:
                ic.commitText("ো",1);break;
            case 119:
                ic.commitText("ৌ",1);break;
            case 120:
                ic.commitText("ৃ",1);break;
            case 121:
                ic.commitText("ক্ক",1);break;
            case 122:
                ic.commitText("ক্ট্র",1);break;
            case 123:
                ic.commitText("ক্র",1);break;
            case 124:
                ic.commitText("ক্ষ",1);break;
            case 125:
                ic.commitText("ক্ল",1);break;
            case 126:
                ic.commitText("ক্ট",1);break;
            case 127:
                ic.commitText("ক্ব",1);break;
            case 128:
                ic.commitText("ক্স",1);break;
            case 129:
                ic.commitText("ক্ষ্ণ",1);break;
            case 130:
                ic.commitText("ক্ত",1);break;
            case 131:
                ic.commitText("ক্ষ্ম",1);break;
            case 132:
                ic.commitText("খ্র",1);break;
            case 133:
                ic.commitText("গ্র",1);break;
            case 134:
                ic.commitText("গ্ল",1);break;
            case 135:
                ic.commitText("গ্ম",1);break;
            case 136:
                ic.commitText("গ্ন",1);break;
            case 137:
                ic.commitText("গ্ব",1);break;
            case 138:
                ic.commitText("গ্ধ",1);break;
            case 139:
                ic.commitText("ঘ্র",1);break;
            case 140:
                ic.commitText("ঘ্ন",1);break;
            case 141:
                ic.commitText("ঙ্গ",1);break;
            case 142:
                ic.commitText("ঙ্ক",1);break;
            case 143:
                ic.commitText("ঙ্খ",1);break;
            case 144:
                ic.commitText("ঙ্ঘ",1);break;
            case 145:
                ic.commitText("ঙ্ক্ষ",1);break;
            case 146:
                ic.commitText("ঙ্ম",1);break;
            case 147:
                ic.commitText("ঙ্ব",1);break;
            case 148:
                ic.commitText("ঙ্ক্র",1);break;
            case 149:
                ic.commitText("চ্র",1);break;
            case 150:
                ic.commitText("চ্ছ",1);break;
            case 151:
                ic.commitText("চ্ঞ",1);break;
            case 152:
                ic.commitText("চ্ছ্র",1);break;
            case 153:
                ic.commitText("চ্চ",1);break;
            case 154:
                ic.commitText("চ্ছ্ব",1);break;
            case 155:
                ic.commitText("জ্জ",1);break;
            case 156:
                ic.commitText("জ্ঝ",1);break;
            case 157:
                ic.commitText("জ্র",1);break;
            case 158:
                ic.commitText("জ্ঞ",1);break;
            case 159:
                ic.commitText("জ্জ্ব",1);break;
            case 160:
                keyboard=new Keyboard(this,R.xml.qwerty4);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 161:
                ic.commitText("জ্ব",1);break;
            case 162:
                ic.commitText("ঞ্ঝ",1);break;
            case 163:
                ic.commitText("ঞ্ছ",1);break;
            case 164:
                ic.commitText("ঞ্জ",1);break;
            case 165:
                ic.commitText("ঞ্চ",1);break;
            case 166:
                ic.commitText("ট্র",1);break;
            case 167:
                ic.commitText("ট্ট",1);break;
            case 168:
                ic.commitText("ড্র",1);break;
            case 169:
                ic.commitText("ড্ড",1);break;
            case 170:
                ic.commitText("ণ্ট্র",1);break;
            case 171:
                ic.commitText("ণ্ম",1);break;
            case 172:
                ic.commitText("ণ্ড্র",1);break;
            case 173:
                ic.commitText("ণ্ব",1);break;
            case 174:
                ic.commitText("ণ্ন",1);break;
            case 175:
                ic.commitText("ণ্ঠ",1);break;
            case 176:
                ic.commitText("ণ্ট",1);break;
            case 177:
                ic.commitText("ণ্ড",1);break;
            case 178:
                ic.commitText("ত্ত",1);break;
            case 179:
                ic.commitText("ত্ম",1);break;
            case 180:
                ic.commitText("ত্র",1);break;
            case 181:
                ic.commitText("ত্ত্ব",1);break;
            case 182:
                ic.commitText("ত্ন",1);break;
            case 183:
                ic.commitText("ত্থ",1);break;
            case 184:
                ic.commitText("ত্ব",1);break;
            case 185:
                ic.commitText("থ্র",1);break;
            case 186:
                ic.commitText("থ্ব",1);break;
            case 187:
                ic.commitText("দ্দ্ব",1);break;
            case 188:
                ic.commitText("দ্দ",1);break;
            case 189:
                ic.commitText("দ্ভ",1);break;
            case 190:
                ic.commitText("দ্ভ্র",1);break;
            case 191:
                ic.commitText("দ্ধ",1);break;
            case 192:
                ic.commitText("দ্ঘ",1);break;
            case 193:
                ic.commitText("দ্গ",1);break;
            case 194:
                ic.commitText("দ্র",1);break;
            case 195:
                ic.commitText("দ্ম",1);break;
            case 196:
                ic.commitText("দ্ব",1);break;
            case 197:
                ic.commitText("ধ্ন",1);break;
            case 198:
                ic.commitText("ধ্ব",1);break;
            case 199:
                ic.commitText("ধ্র",1);break;
            case 200:
                ic.commitText("ধ্ম",1);break;
            case 201:
                ic.commitText("ন্ড্র",1);break;
            case 202:
                ic.commitText("ন্ট্র",1);break;
            case 203:
                ic.commitText("ন্দ্ব",1);break;
            case 204:
                ic.commitText("ন্ঠ",1);break;
            case 205:
                ic.commitText("ন্ব",1);break;
            case 206:
                ic.commitText("ন্ধ",1);break;
            case 207:
                ic.commitText("ন্থ",1);break;
            case 208:
                ic.commitText("ন্ম",1);break;
            case 209:
                ic.commitText("ন্দ্র",1);break;
            case 210:
                keyboard=new Keyboard(this,R.xml.qwerty5);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 211:
                ic.commitText("ন্স",1);break;
            case 212:
                ic.commitText("ন্ড",1);break;
            case 213:
                ic.commitText("ন্ত্র",1);break;
            case 214:
                ic.commitText("ন্ট",1);break;
            case 215:
                ic.commitText("ন্ন",1);break;
            case 216:
                ic.commitText("ন্দ",1);break;
            case 217:
                ic.commitText("ন্ত",1);break;
            case 218:
                ic.commitText("প্ট",1);break;
            case 219:
                ic.commitText("প্প",1);break;
            case 220:
                ic.commitText("প্ল",1);break;
            case 221:
                ic.commitText("প্র",1);break;
            case 222:
                ic.commitText("প্স",1);break;
            case 223:
                ic.commitText("প্ত",1);break;
            case 224:
                ic.commitText("প্ন",1);break;
            case 225:
                ic.commitText("ফ্র",1);break;
            case 226:
                ic.commitText("ফ্ল",1);break;
            case 227:
                ic.commitText("ব্দ",1);break;
            case 228:
                ic.commitText("ব্ল",1);break;
            case 229:
                ic.commitText("ব্ধ",1);break;
            case 230:
                ic.commitText("ব্র",1);break;
            case 231:
                ic.commitText("ব্জ",1);break;
            case 232:
                ic.commitText("ব্ব",1);break;
            case 233:
                ic.commitText("ভ্র",1);break;
            case 234:
                ic.commitText("ভ্ল",1);break;
            case 235:
                ic.commitText("ম্ন",1);break;
            case 236:
                ic.commitText("ম্প",1);break;
            case 237:
                ic.commitText("ম্প্র",1);break;
            case 238:
                ic.commitText("ম্ফ",1);break;
            case 239:
                ic.commitText("ম্ব",1);break;
            case 240:
                ic.commitText("ম্ভ",1);break;
            case 241:
                ic.commitText("ম্ভ্র",1);break;
            case 242:
                ic.commitText("ম্ব্র",1);break;
            case 243:
                ic.commitText("ম্র",1);break;
            case 244:
                ic.commitText("ম্ল",1);break;
            case 245:
                ic.commitText("ম্ম",1);break;
            case 246:
                ic.commitText("ল্র",1);break;
            case 247:
                ic.commitText("ল্ড্র",1);break;
            case 248:
                ic.commitText("ল্ভ",1);break;
            case 249:
                ic.commitText("ল্ল",1);break;
            case 250:
                ic.commitText("ল্ট্র",1);break;
            case 251:
                ic.commitText("ল্ব",1);break;
            case 252:
                ic.commitText("ল্গ",1);break;
            case 253:
                ic.commitText("ল্ক",1);break;
            case 254:
                ic.commitText("ল্ম",1);break;
            case 255:
                ic.commitText("ল্ড",1);break;
            case 256:
                ic.commitText("ল্ট",1);break;
            case 257:
                ic.commitText("ল্প",1);break;
            case 258:
                ic.commitText("শ্ব",1);break;
            case 259:
                ic.commitText("শ্র",1);break;
            case 260:
                keyboard=new Keyboard(this,R.xml.qwerty6);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 261:
                ic.commitText("শ্চ",1);break;
            case 262:
                ic.commitText("শ্ন",1);break;
            case 263:
                ic.commitText("শ্ল",1);break;
            case 264:
                ic.commitText("শ্ম",1);break;
            case 265:
                ic.commitText("শ্ছ",1);break;
            case 266:
                ic.commitText("শ্ত",1);break;
            case 267:
                ic.commitText("ষ্ট",1);break;
            case 268:
                ic.commitText("ষ্ঠ",1);break;
            case 269:
                ic.commitText("ষ্ট্র",1);break;
            case 270:
                ic.commitText("ষ্ক",1);break;
            case 271:
                ic.commitText("ষ্ণ",1);break;
            case 272:
                ic.commitText("ষ্প",1);break;
            case 273:
                ic.commitText("ষ্ম",1);break;
            case 274:
                ic.commitText("ষ্ক্র",1);break;
            case 275:
                ic.commitText("ষ্প্র",1);break;
            case 276:
                ic.commitText("ষ্ফ",1);break;
            case 277:
                ic.commitText("স্ফ",1);break;
            case 278:
                ic.commitText("স্ল",1);break;
            case 279:
                ic.commitText("স্র",1);break;
            case 280:
                ic.commitText("স্ন",1);break;
            case 281:
                ic.commitText("স্ক্র",1);break;
            case 282:
                ic.commitText("স্ক",1);break;
            case 283:
                ic.commitText("স্প",1);break;
            case 284:
                ic.commitText("স্ত্র",1);break;
            case 285:
                ic.commitText("স্ম",1);break;
            case 286:
                ic.commitText("স্ট্র",1);break;
            case 287:
                ic.commitText("স্ত",1);break;
            case 288:
                ic.commitText("স্থ",1);break;
            case 289:
                ic.commitText("স্ব",1);break;
            case 290:
                ic.commitText("স্ট",1);break;
            case 291:
                ic.commitText("হ্ল",1);break;
            case 292:
                ic.commitText("হ্ব",1);break;
            case 293:
                ic.commitText("হ্ন",1);break;
            case 294:
                ic.commitText("হ্র",1);break;
            case 295:
                ic.commitText("হ্ণ",1);break;
            case 296:
                ic.commitText("হ্ম",1);break;
            case 297:
                ic.commitText("হৃ",1);break;
            case 298:
                ic.commitText("র্ধ",1);break;
            case 299:
                ic.commitText("র্স",1);break;
            case 300:
                ic.commitText("র্ঘ",1);break;
            case 301:
                ic.commitText("র্দ",1);break;
            case 302:
                ic.commitText("র্ষ",1);break;
            case 303:
                ic.commitText("র্ড",1);break;
            case 304:
                ic.commitText("র্ভ",1);break;
            case 305:
                ic.commitText("র্জ",1);break;
            case 306:
                ic.commitText("র্ট",1);break;
            case 307:
                ic.commitText("র্ক",1);break;
            case 308:
                ic.commitText("র্শ",1);break;
            case 309:
                ic.commitText("র্থ",1);break;
            case 310:
                ic.commitText("র্ম",1);break;
            case 311:
                ic.commitText("র্ণ",1);break;
            case 312:
                ic.commitText("র্ন",1);break;
            case 313:
                ic.commitText("র্ত",1);break;
            case 314:
                ic.commitText("র্য",1);break;
            case 315:
                ic.commitText("র্ব",1);break;
        }
    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
