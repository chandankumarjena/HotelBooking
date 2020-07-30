# HotelBooking
This applicartion is a rest api service used to book the hotel.
Objective of application:-
Steps to execute:-
JSON Structure:-
Case 1:- for successfully placing orders return 201
{
		"hotelName":"Pearl Bridge",
		"checkInDate":"2020-08-31",
		"checkOutDate":"2020-09-07",
		"totalAmount": 15000,
		"customers":[
			{
				"name":"chandan",
				"email":"chandanjena706@gmail.com",
				"number":"9938161870"
			}
		],
		"rooms":[
			{
				"roomName":"PB00100",
				"numberOfGuest":4
			}
		]
}

Case 2:- validation when hotelName is null return 400

{
		"hotelName": null,
		"checkInDate":"2020-08-31",
		"checkOutDate":"2020-09-07",
		"totalAmount": 15000,
		"customers":[
			{
				"name":"chandan",
				"email":"chandanjena706@gmail.com",
				"number":"9938161870"
			}
		],
		"rooms":[
			{
				"roomName":"PB00100",
				"numberOfGuest":4
			}
		]
}


Case 3:- validation when email is invalid return 400

{
		"hotelName": null,
		"checkInDate":"2020-08-31",
		"checkOutDate":"2020-09-07",
		"totalAmount": 15000,
		"customers":[
			{
				"name":"chandan",
				"email":"chandanjenacom",
				"number":"9938161870"
			}
		],
		"rooms":[
			{
				"roomName":"PB00100",
				"numberOfGuest":4
			}
		]
}

Case 3:- validation when roomName is null return 400

{
		"hotelName": null,
		"checkInDate":"2020-08-31",
		"checkOutDate":"2020-09-07",
		"totalAmount": 15000,
		"customers":[
			{
				"name":"chandan",
				"email":"chandanjena@gmail.com",
				"number":"9938161870"
			}
		],
		"rooms":[
			{
				"roomName": null,
				"numberOfGuest":4
			}
		]
}
Reverse Engineering:-
https://drive.google.com/file/d/14wksE_4UrjqRCdVynkSrse7FtjYOK9aY/view?usp=sharing





