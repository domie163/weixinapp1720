<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">戏曲名称</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiquName" type="text" v-model="ruleForm.xiquName" placeholder="戏曲名称"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">戏曲编号</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiquUuidNumber" type="text" v-model="ruleForm.xiquUuidNumber" placeholder="戏曲编号"></input>
            </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="xiquPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲照片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.xiquPhoto" :src="baseUrl+ruleForm.xiquPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">发源地</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiquAddress" type="text" v-model="ruleForm.xiquAddress" placeholder="发源地"></input>
            </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="xiquFileTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲文件</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.xiquFile" :src="baseUrl+ruleForm.xiquFile" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="xiquMusicTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲音频</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.xiquMusic" :src="baseUrl+ruleForm.xiquMusic" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="xiquVideoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲视频</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.xiquVideo" :src="baseUrl+ruleForm.xiquVideo" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲类型</view>
                    <picker @change="xiquTypesChange" :value="xiquTypesIndex" :range="xiquTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.xiquTypes?ruleForm.xiquValue:"请选择戏曲类型"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">赞</view>
                    <input   disabled
                             :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.zanNumber" type="number" v-model="ruleForm.zanNumber" placeholder="赞"></input>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">踩</view>
                    <input   disabled
                             :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.caiNumber" type="number" v-model="ruleForm.caiNumber" placeholder="踩"></input>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">戏曲热度</view>
                    <input   disabled
                             :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.xiquClicknum" type="number" v-model="ruleForm.xiquClicknum" placeholder="戏曲热度"></input>
                </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">戏曲介绍</view>
                <textarea :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx var(--publicSubColor)","margin":"6rpx 0rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"40rpx 0","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.xiquContent" v-model="ruleForm.xiquContent" placeholder="戏曲介绍"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"var(--publicMainColor)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					xiquName: false,
					xiquUuidNumber: true,
					xiquPhoto: false,
					xiquAddress: false,
					xiquFile: false,
					xiquMusic: false,
					xiquVideo: false,
					xiquTypes: false,
					zanNumber: false,
					caiNumber: false,
					xiquClicknum: false,
					xiquContent: false,
					shangxiaTypes: false,
					xiquDelete: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					xiquName: '',
					xiquUuidNumber: this.getUUID(),//数字
					xiquPhoto: '',
					xiquAddress: '',
					xiquFile: '',
					xiquMusic: '',
					xiquVideo: '',
					xiquTypes: '',//数字
					xiquValue: '',//数字对应的值
					zanNumber: '',
					caiNumber: '',
					xiquClicknum: '',
					xiquContent: '',
					shangxiaTypes: '',//数字
					shangxiaValue: '',//数字对应的值
					xiquDelete: '',
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				xiquTypesOptions: [],
							xiquTypesIndex : 0,
				shangxiaTypesOptions: [],
							shangxiaTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let xiquTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'xiqu_types',
            }
			let xiquTypes = await this.$api.page(`dictionary`, xiquTypesParams);
			this.xiquTypesOptions = xiquTypes.data.list
		/*下拉框*/
			let shangxiaTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'shangxia_types',
            }
			let shangxiaTypes = await this.$api.page(`dictionary`, shangxiaTypesParams);
			this.shangxiaTypesOptions = shangxiaTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`xiqu`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.xiquId){
                this.ruleForm.xiquId = options.xiquId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            xiquTypesChange(e) {
                this.xiquTypesIndex = e.target.value
                this.ruleForm.xiquValue = this.xiquTypesOptions[this.xiquTypesIndex].indexName
                this.ruleForm.xiquTypes = this.xiquTypesOptions[this.xiquTypesIndex].codeIndex
            },
            shangxiaTypesChange(e) {
                this.shangxiaTypesIndex = e.target.value
                this.ruleForm.shangxiaValue = this.shangxiaTypesOptions[this.shangxiaTypesIndex].indexName
                this.ruleForm.shangxiaTypes = this.shangxiaTypesOptions[this.shangxiaTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			xiquPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.xiquPhoto = 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			xiquFileTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.xiquFile = 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			xiquMusicTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.xiquMusic = 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			xiquVideoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.xiquVideo = 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			insertTimeConfirm(val) {
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.xiquName)) {
                    this.$utils.msg(`戏曲名称不能为空`);
                    return
                }
				if ((!this.ruleForm.xiquUuidNumber)) {
                    this.$utils.msg(`戏曲编号不能为空`);
                    return
                }
				if ((!this.ruleForm.xiquPhoto)) {
                    this.$utils.msg(`戏曲照片不能为空`);
                    return
                }
				if ((!this.ruleForm.xiquAddress)) {
                    this.$utils.msg(`发源地不能为空`);
                    return
                }
				if ((!this.ruleForm.zanNumber) && (!this.$validate.isIntNumer(this.ruleForm.zanNumber)) && this.ruleForm.zanNumber >0) {
                    this.$utils.msg(`赞不能为空，不能小于0 格式为数字`);
                    return
                }
				if ((!this.ruleForm.caiNumber) && (!this.$validate.isIntNumer(this.ruleForm.caiNumber)) && this.ruleForm.caiNumber >0) {
                    this.$utils.msg(`踩不能为空，不能小于0 格式为数字`);
                    return
                }
				if ((!this.ruleForm.xiquClicknum) && (!this.$validate.isIntNumer(this.ruleForm.xiquClicknum)) && this.ruleForm.xiquClicknum >0) {
                    this.$utils.msg(`戏曲热度不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`xiqu`, this.ruleForm);
                } else {
                    await this.$api.save(`xiqu`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>
<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .cu-form-group .title {
        height: auto;
        line-height:30rpx
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 80rpx;
    }

    .select .uni-input {
        line-height: 80rpx;
    }

    .input .right-input {
        line-height: 88rpx;
    }
</style>