;(function($){
/**
 * jqGrid Arabic Translation
 * 
 * http://trirand.com/blog/ 
 * Dual licensed under the MIT and GPL licenses:
 * http://www.opensource.org/licenses/mit-license.php
 * http://www.gnu.org/licenses/gpl.html
**/
$.jgrid = $.jgrid || {};
$.extend($.jgrid,{
	defaults : {
		recordtext: " عرض  {0} - {1}  من  {2}",
		emptyrecords: "لا توجد بيانات للعرض",
		loadtext: "تحميل...",
		pgtext : "الصفحة  {0} من  {1}"
	},
	search : {
		caption: "بحث...",
		Find: "بحث",
		Reset: "إعادة للوضع السابق",
		odata: [{ oper:'eq', text:"مساوي"},{ oper:'ne', text:"غير مساوي"},{ oper:'lt', text:"اقل"},{ oper:'le', text:"اقل او يساوي"},{ oper:'gt', text:"اكبر"},{ oper:'ge', text:"اكبر او يساوي"},{ oper:'bw', text:"يبدأ ب"},{ oper:'bn', text:"لا يبدأ ب"},{ oper:'in', text:"موجود في"},{ oper:'ni', text:"غير موجود في"},{ oper:'ew', text:"ينتهي ب"},{ oper:'en', text:"لا ينتهي ب"},{ oper:'cn', text:"يحتوي على "},{ oper:'nc', text:"لا يحتوي على"},{ oper:'nu', text:'لا توجد بيانات'},{ oper:'nn', text:'توجد بيانات'}],
		groupOps: [	{ op: "AND", text: "الكل" },	{ op: "OR",  text: "اي" }],
		operandTitle : "اختر عملية البحث.",
		resetTitle : "إعادة البحث"
},
	edit : {
		addCaption: "اضافة حقل",
		editCaption: "تحرير الحقل",
		bSubmit: "ارسال",
		bCancel: "الغاء",
		bClose: "اغلاق",
		saveData: "حفظ التعديلات الجديدة؟",
		bYes: "نعم",
		bNo: "لا",
		bExit: "الغاء",
		msg: {
			required: "يجب تعبئة الحقل",
			number: "يرجى ادخال رقم صحيح",
			minValue: "القيمة يجب ان تكون مساويه او اكبر",
			maxValue: "القيمة يجب ان تكون مساوية او اقل ",
			email: "البريد الالكتروني غير صحيح",
			integer: "يرجى ادخال رقم صحيح",
			url: "الرابط غير صحيح. صيغة الرابط ('http://' او 'https://')",
			nodefined : " غير معرف!",
			novalue : " مطلوب قيمة الإرجاع!",
			customarray : "Custom function should return array!",
			customfcheck : "Custom function should be present in case of custom checking!"
		}
	},
	view : {
		caption: "عرض السجل",
		bClose: "اغلاق"
	},
	del : {
		caption: "حذف",
		msg: "حذف السجلات المختارة؟",
		bSubmit: "حذف",
		bCancel: "الغاء"
	},
	nav : {
		edittext: " ",
		edittitle: "تحرير السجل ",
		addtext:" ",
		addtitle: "اضافة سجل جديد",
		deltext: " ",
		deltitle: "حذف السجل",
		searchtext: " ",
		searchtitle: "البحث عن سجل",
		refreshtext: "",
		refreshtitle: "تحديث",
		alertcap: "انذار",
		alerttext: "يرجى اختيار السجل",
		viewtext: "",
		viewtitle: "عرض السجل"
	},
	col : {
		caption: "حدد الأعمدة",
		bSubmit: "حفظ",
		bCancel: "الغاء"
	},
	errors : {
		errcap : "خطأ",
		nourl : "لم يتم تعيين أي رابط",
		norecords: "عدم وجود سجلات لمعالجة",
		model : "Length of colNames <> colModel!"
	},
	formatter : {
		integer : {defaultValue: '0'},
		number : {decimalPlaces: 2, defaultValue: '0'},
		currency : {decimalPlaces: 2, prefix: "", suffix:"", defaultValue: '0'},
		date : {
			dayNames:   [
				"الاحد", "الاثنين", "الثلاثاء", "الاربعاء", "الخميس", "الجمعة", "السبت",
				"الاحد", "الاثنين", "الثلاثاء", "الاربعاء", "الخميس", "الجمعة", "السبت"
			],
			monthNames: [
				"يناير", "فبراير", "مارس", "ابريل", "مايو", "يونيو", "يوليو", "اغسطس", "سبتمبر", "اكتوبر", "نوفمبر", "ديسمبر",
					"يناير", "فبراير", "مارس", "ابريل", "مايو", "يونيو", "يوليو", "اغسطس", "سبتمبر", "اكتوبر", "نوفمبر", "ديسمبر"
                          	],
			AmPm : ["صباحا","مساءا","صباحا","مساءا"],
			S: function (j) {return j == 1 ? 'er' : 'e';},
			srcformat: 'Y-m-d',
			newformat: 'd/m/Y',
			parseRe : /[#%\\\/:_;.,\t\s-]/,
			masks : {
				ISO8601Long:"Y-m-d H:i:s",
				ISO8601Short:"Y-m-d",
				ShortDate: "n/j/Y",
				LongDate: "l, F d, Y",
				FullDateTime: "l, F d, Y g:i:s A",
				MonthDay: "F d",
				ShortTime: "g:i A",
				LongTime: "g:i:s A",
				SortableDateTime: "Y-m-d\\TH:i:s",
				UniversalSortableDateTime: "Y-m-d H:i:sO",
				YearMonth: "F, Y"
			},
			reformatAfterEdit : false
		},
		baseLinkUrl: '',
		showAction: '',
		target: '',
		checkbox : {disabled:true},
		idName : 'id'
	}
});
})(jQuery);
